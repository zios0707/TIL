import "./App.css";
import { useState } from "react";

const App = () => {
  const [text, setText] = useState("1");
  const [edit, setEdit] = useState("false");

  let content = (
    <div>
      {text}
      <button onClick={() => setEdit(true)}>수정</button>
    </div>
  );

  if (edit) {
    content = (
      <div>
        <input
          type="text"
          value={text}
          onChange={(e) => {
            setText(e.target.value);
          }}
        />
        <button onClick={() => setEdit(false)}>수정</button>
      </div>
    );
  }

  return <>{content}</>;
};

export default App;
