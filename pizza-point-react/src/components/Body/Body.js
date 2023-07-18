import "./Body.css";
import Categories from "./Categories";
import ItemList from "./ItemList";

export default function Body() {
  return (
    <body>
      <div className="body-container">
        <Categories />
        <ItemList />
      </div>
    </body>
  );
}
