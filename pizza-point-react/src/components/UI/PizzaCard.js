import styled from "styled-components";

const PizzaCard = styled.li`
  padding: 1rem;
  margin: 1rem;
  text-align: centre;
  background: rgb(200, 51, 74);
  border-radius: 1rem;
  width: auto;
  transition: 0.3s;

  .item-name {
    font-size: 2rem;
    font-weight: 600;
  }
  .item-price {
    color: white;
    background: black;
    width: 20%;
    border-style: none;
    border-radius: 1rem;
    transition: 0.3s;
  }

  &:hover {
    margin: 0;
    opacity: 95%;
    .item-name {
      color: white;
    }
    .item-price:hover {
      background: grey;
    }
  }
`;
export default PizzaCard;
