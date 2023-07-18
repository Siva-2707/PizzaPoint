export default function CategoryList(props) {
  return (
    <ul>
      {props.defaultCategories.map((category) => (
        <li key={category.id}>{category.value}</li>
      ))}
    </ul>
  );
}
