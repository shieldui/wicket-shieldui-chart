package com.shieldui.wicket.maskedtextbox;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class ChangeEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public ChangeEventListener()
    {
        super(MaskedTextBoxOptions.Event.CHANGE.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +                                
                "\"value\":" + eventVarName + ".value," + 
                "\"enabled\":" + eventVarName + ".target.enabled()," + 
                "\"visible\":" + eventVarName + ".target.visible()" + 
                "}";
    }
}
