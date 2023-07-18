import CategoryList from "./CategoryList";

const defaultCategories = [
  {
    id: 1,
    value: "Pizzas",
  },
  {
    id: 2,
    value: "Snacks",
  },
  {
    id: 3,
    value: "Beverages",
  },
];

const Categories = () => {
  return <CategoryList defaultCategories={defaultCategories} />;
};

export default Categories;
