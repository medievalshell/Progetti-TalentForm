import ChildProps from "./ChildProps";
import SonProps from "./SonProps";


const ParentProps = () => {
  return (
    <div>
      <ChildProps surname="verdi" city="italy" age={35} />
      <div>
        <SonProps surname="verdi" nation="italy" age={35} />
      </div>
    </div>
  );
};

export default ParentProps;
