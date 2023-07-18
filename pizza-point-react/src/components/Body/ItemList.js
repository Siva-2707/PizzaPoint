import Item from "./Item/Item";

export default function ItemList() {
  const defaultItems = [
    {
      name: "Onion Pizza",
      desc: "",
      category: "Pizzas",
      type: "veg",
      price: 200,
    },
    {
      name: "Chicken Pizza",
      desc: "",
      category: "Pizzas",
      type: "non-veg",
      price: 250,
    },
    {
      name: "Fries",
      desc: "",
      category: "Snacks",
      type: "veg",
      price: 100,
    },
    {
      name: "Coke",
      desc: "",
      category: "Beverages",
      type: "veg",
      price: 70,
    },
  ];

  return (
    <ul>
      {defaultItems.map((item) => (
        <Item item={item} />
      ))}
    </ul>
  );
}
