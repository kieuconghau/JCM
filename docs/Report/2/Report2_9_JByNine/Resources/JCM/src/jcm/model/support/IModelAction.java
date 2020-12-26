package jcm.model.support;

public interface IModelAction {
    void save();  //insert or update, unique val
    void remove(); //remove with current model unique val

}
