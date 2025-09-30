document.addEventListener('DOMContentLoaded', function () {
	const app = document.getElementById('app');
	app.innerHTML = `
		<div id="monaco-container" style="height: 250px; border-radius: 6px; overflow: hidden;"></div>
		<div class="d-flex justify-content-center mb-3 gap-2">
			<button id="runBtn" class="btn btn-success">Esegui</button>
			<button id="saveBtn" class="btn btn-primary">Salva esercizio</button>
			<button id="loadBtn" class="btn btn-warning">Carica esercizi</button>
			<button id="clearBtn" class="btn btn-danger">Clear</button>
		</div>
		<div id="output" class="rounded"></div>
		<div id="saved-list"></div>
	`;
	window.require.config({ paths: { 'vs': 'https://cdn.jsdelivr.net/npm/monaco-editor@0.45.0/min/vs' } });
	window.require(['vs/editor/editor.main'], function () {
				monaco.editor.defineTheme('winter-is-coming', {
					base: 'vs-dark',
					inherit: true,
					rules: [
						{ token: '', foreground: 'd6deeb', background: '011627' },
						{ token: 'comment', foreground: '637777', fontStyle: 'italic' },
						{ token: 'keyword', foreground: 'c792ea' },
						{ token: 'number', foreground: 'f78c6c' },
						{ token: 'string', foreground: 'ecc48d' },
						{ token: 'type', foreground: '82aaff' },
						{ token: 'function', foreground: '82aaff' },
						{ token: 'identifier', foreground: 'addb67' },
						{ token: 'delimiter', foreground: 'd6deeb' },
						{ token: 'variable', foreground: 'addb67' },
						{ token: 'constant', foreground: 'ff5874' },
						{ token: 'class', foreground: 'ffcb8b' },
						{ token: 'operator', foreground: 'c792ea' },
					],
					colors: {
						'editor.background': '#011627',
						'editor.foreground': '#d6deeb',
						'editorLineNumber.foreground': '#3b5378',
						'editorCursor.foreground': '#80cbc4',
						'editor.selectionBackground': '#1d3b53',
						'editor.inactiveSelectionBackground': '#1d3b53aa',
            'editorIndentGuide.background': '#1d3b53',
            'editorIndentGuide.activeBackground': '#82aaff',
            'editorIndentGuide.background1': '#1d3b53',
            'editorIndentGuide.background2': '#274472',
            'editorIndentGuide.background3': '#355d8e',
            'editorIndentGuide.background4': '#4676b6',
            'editorIndentGuide.background5': '#5a9be6',
            'editorIndentGuide.background6': '#82aaff',
            'editorIndentGuide.activeBackground1': '#355d8e',
            'editorIndentGuide.activeBackground2': '#4676b6',
            'editorIndentGuide.activeBackground3': '#5a9be6',
            'editorIndentGuide.activeBackground4': '#82aaff',
            'editorIndentGuide.activeBackground5': '#c3e8fa',
            'editorIndentGuide.activeBackground6': '#e3f6ff',
						'editor.lineHighlightBackground': '#011221',
						'editorWidget.background': '#011221',
						'editorWidget.border': '#1d3b53',
						'editorSuggestWidget.background': '#011221',
						'editorSuggestWidget.border': '#1d3b53',
						'editorSuggestWidget.foreground': '#d6deeb',
						'editorSuggestWidget.selectedBackground': '#1d3b53',
					}
				});
				const editor = monaco.editor.create(document.getElementById('monaco-container'), {
					value: '// Scrivi qui il tuo codice JavaScript\n',
					language: 'javascript',
					theme: 'winter-is-coming',
					fontSize: 16,
					minimap: { enabled: false },
					automaticLayout: true,
					renderIndentGuides: true,
					renderWhitespace: 'all',
					guides: { indentation: true, highlightActiveIndentation: true }
				});
		const output = document.getElementById('output');
		const savedList = document.getElementById('saved-list');
		document.getElementById('clearBtn').onclick = function () {
			editor.setValue('');
		};
			const consolePanel = document.getElementById('console-panel');
			function appendToConsole(msg, type = 'log') {
				const el = document.createElement('div');
				el.textContent = msg;
				if(type === 'error') el.style.color = '#ff5874';
				if(type === 'warn') el.style.color = '#ecc48d';
				consolePanel.appendChild(el);
				consolePanel.scrollTop = consolePanel.scrollHeight;
			}
			const oldLog = console.log, oldErr = console.error, oldWarn = console.warn, oldInfo = console.info;
			console.log = function(...args) { oldLog(...args); appendToConsole(args.join(' '), 'log'); };
			console.error = function(...args) { oldErr(...args); appendToConsole(args.join(' '), 'error'); };
			console.warn = function(...args) { oldWarn(...args); appendToConsole(args.join(' '), 'warn'); };
			console.info = function(...args) { oldInfo(...args); appendToConsole(args.join(' '), 'info'); };
			document.getElementById('runBtn').onclick = function () {
				consolePanel.innerHTML = '';
				let result = '';
				try {
					result = eval(editor.getValue());
					if (result === undefined) result = 'Eseguito senza errori.';
				} catch (e) {
					result = 'Errore: ' + e.message;
					appendToConsole(result, 'error');
				}
				output.textContent = result;
			};
		document.getElementById('saveBtn').onclick = function () {
			let exercises = JSON.parse(localStorage.getItem('exercises') || '[]');
			exercises.push({ code: editor.getValue(), date: new Date().toLocaleString() });
			localStorage.setItem('exercises', JSON.stringify(exercises));
			alert('Esercizio salvato!');
		};
		document.getElementById('loadBtn').onclick = function () {
			const exercises = JSON.parse(localStorage.getItem('exercises') || '[]');
			savedList.innerHTML = '<h3 class="text-light">Esercizi salvati:</h3>';
			exercises.forEach((ex, i) => {
				const btn = document.createElement('button');
				btn.textContent = `Esercizio ${i+1} (${ex.date})`;
				btn.className = 'btn btn-outline-light btn-sm m-1';
				btn.onclick = () => {
					editor.setValue(ex.code);
				};
				savedList.appendChild(btn);
			});
			if (exercises.length === 0) savedList.innerHTML += '<p class="text-light">Nessun esercizio salvato.</p>';
		};
	});
});
