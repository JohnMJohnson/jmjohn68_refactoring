package main.java.memoranda;
/**
 * @author John M. Johnson
 */
import main.java.memoranda.interfaces.IProject;
import main.java.memoranda.interfaces.ITask;
import main.java.memoranda.interfaces.ITaskList;
import nu.xom.Attribute;
import nu.xom.Element;
import main.java.memoranda.date.CalendarDate;
// TASK 2-2 SMELL BETWEEN CLASSES
// DIVERGENT CHANGE
// REFACTORED OUT INTO TakDate.java
public final class TaskDate {

    //private Element _element;
    //private ITaskList _tl;
    
    public static CalendarDate getStartDate(Element _element) {
        return new CalendarDate(_element.getAttribute("startDate").getValue());
    }
    
    public static Element setStartDate(CalendarDate date, Element _element) {
        Attribute starting = _element.getAttribute("startDate");
        if (starting == null)
            _element.addAttribute(new Attribute("startDate", date.toString()));
         else
             starting.setValue(date.toString());
        return _element;
    }

    public static CalendarDate getEndDate(Element _element, ITaskList _tl, ITask caller) {
        String ed = _element.getAttribute("endDate").getValue();
        if (ed != "")
            return new CalendarDate(_element.getAttribute("endDate").getValue());
        ITask parent = caller.getParentTask();
        if (parent != null)
            return getEndDate(parent.get_element(), parent.get_tl(), parent);
        IProject pr = _tl.getProject();
        if (pr.getEndDate() != null)
            return pr.getEndDate();
        return getStartDate(_element);
    }
    
    public static Element setEndDate(CalendarDate date, Element _element) {
        Attribute ending = _element.getAttribute("endDate");
        if (ending == null) {
            _element.addAttribute(new Attribute("endDate", date.toString()));
            ending = _element.getAttribute("endDate");
        }
        if (date == null) {
            ending.setValue("");
        }
        ending.setValue(date.toString());
        return _element;    }
    
}
