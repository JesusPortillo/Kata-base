import {useReducer} from "react";
import { initialState } from "../Store/Store";
import reducer from "../reducer/reducer";
import Store from "../Store/Store";

const StoreProvider = ({ children }) => {
    const [state, dispatch] = useReducer(reducer, initialState);
  
    return <Store.Provider value={{ state, dispatch }}>
      {children}
    </Store.Provider>
  
  }

  export default StoreProvider;