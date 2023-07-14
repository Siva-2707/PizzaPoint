import Toppings from "../topping/Toppings";
import './Pizza.css';
export default function Pizza({pizza, toppingList}){
    return(
        <div className="pizza">
            <div className="pizza__name">{pizza.name}</div>
            <div className="pizza__desc">{pizza.desc}</div>
            <div className="pizza__price">{pizza.price}</div>
            <Toppings toppings={toppingList} />
        </div>
    );
}