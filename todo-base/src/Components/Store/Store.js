
export const initialState = {
    todo: { list: [], item: {} }
  };
export const Store = createContext(initialState);

export default Store;