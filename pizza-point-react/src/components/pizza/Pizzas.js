import Pizza from "./Pizza";
import './Pizzas.css';
function Pizzas({pizzaList,toppingList}){

    return(
        <div className="pizzas">
            <Pizza pizza = {pizzaList[0]} toppingList = {toppingList}/>
            <Pizza pizza = {pizzaList[1]} toppingList = {toppingList}/>
        </div>
    );
}

export default Pizzas;