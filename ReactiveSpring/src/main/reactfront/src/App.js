import "./App.css";
import { useState, useEffect } from "react";
import axios from "axios";

const App = () => {
  const [posts, setPosts] = useState([]);

  useEffect(() => {
    /*axios({ 방법 1
      method:"GET",
      url:'https://jsonplaceholder.typicode.com/photos'
    }).then(response => setPosts(response.data));*/

    axios.get('https://jsonplaceholder.typicode.com/photos') /*방법 2*/
        .then(response => setPosts(response.data))


    /*const response = await axios.get('https://jsonplaceholder.typicode.com/photos') 방법 3 비동기 형식으로 한다는데 컴파일 오류 뜸
    setPosts(response.data)*/
  });

  return (
      <ul>
        {posts.map(post => (
            <li key={post.id}>
              <div>{post.title}</div>
              <div><img src={post.thumbnailUrl} alt=""/></div>
            </li>
        ))}
      </ul>
  );
};

export default App;
