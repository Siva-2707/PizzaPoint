import "./Header.css";
import Search from "./Search/Search";
export default function Header(props) {
  const filterOptionHandler = (event) => {
    //Passing it to the parent component.
    props.getFilterOption(event.target.value);
  };
  return (
    <header className="navbar  justify-content-between">
      <div className="logo">Logo</div>
      <Search />
    </header>
  );
}
