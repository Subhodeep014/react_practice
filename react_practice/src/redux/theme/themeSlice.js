import { createSlice } from "@reduxjs/toolkit";

const initialState = {
    theme : "light",
}

const themeSlice = createSlice({
    name: 'theme',
    initialState,
    reducers : {
        userTheme : (state, action)=>{
            state.theme = action.payload;
        }
    }
})
export const {userTheme} = themeSlice.actions;

export default themeSlice.reducer;