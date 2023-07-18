import "./App.css";
import Body from "./components/Body/Body";
import Header from "./components/Header/Header";
function App() {
  const pizzas = [
    {
      name: "Onion pizza",
      desc: "A pizza with onions",
      price: 200,
    },
    {
      name: "Tomato pizza",
      desc: "A pizza with onions",
      price: 400,
    },
    {
      name: "Capsicum pizza",
      desc: "A pizza with onions",
      price: 600,
    },
  ];
  const toppings = ["Onion", "Tomato", "Paneer"];

  const filterOptionHandler = (option) => {
    console.log(option);
  };

  return (
    <div className="App">
      <Header getFilterOption={filterOptionHandler} />
      <Body />
    </div>
  );
}

export default App;
