import './App.css';
import Header from './components/header/Header';
import Pizzas from './components/pizza/Pizzas';
function App() {

  const pizzas= [
    {
      name: "Onion pizza",
      desc: "A pizza with onions",
      price: 200
    },
    {
      name: "Tomato pizza",
      desc: "A pizza with onions",
      price: 400
    },
    {
      name: "Capsicum pizza",
      desc: "A pizza with onions",
      price: 600
    }
  ];
  const toppings = ['Onion', 'Tomato', 'Paneer']


  return (
    <div className="App">
      <Header/>
      <Pizzas pizzaList={pizzas} toppingList={toppings}/>
    </div>
  );
}

export default App;
