import './Header.css';
import HeaderItem from './HeaderItem';
export default function Header() {
    return (
        <header className="header">
                <HeaderItem item={"Home"}/>
                <HeaderItem item={"Orders"}/>
                <HeaderItem item={"Menu"}/>
        </header>
    );
}