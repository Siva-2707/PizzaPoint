import "./Item.css";
const Item = (props) => {
  return (
    <li>
      <div className="item-container">
        <div className="item-name">{props.item.name}</div>
        <div className="item-desc">{props.item.desc}</div>
        <div className="item-price">{props.item.price}</div>
        {/* <div className="item-category">{props.item.category}</div> */}
        {/* <div className="item-type">{props.item.type}</div> */}
      </div>
    </li>
  );
};

export default Item;
