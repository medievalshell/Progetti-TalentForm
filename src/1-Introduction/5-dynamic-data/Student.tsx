import "./DynamicData.css";

const Student = () => {
  const name = "Paul";
  const surname = "Sholl";
  const age = 32;
  return (
    <div className="student">
      <p>{name}</p>
      <p>{surname}</p>
      <p>{age}</p>
    </div>
  );
};
export default Student;
