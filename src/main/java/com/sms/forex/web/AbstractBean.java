/**
 * Author: Zule Li
 * Email:zule.li@hotmail.com
 * Last Modified Date:Mar.7,2015
 * */
package com.sms.forex.web;


import java.io.Serializable;
import java.text.MessageFormat;
import java.util.ResourceBundle;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * <p>Abstract base class for managed beans to share utility methods.</p>
 */
@Named
@SessionScoped
public class AbstractBean implements Serializable {

    private static final long serialVersionUID = -3375564172975657665L;
 

    /**
     * @return the <code>FacesContext</code> instance for the current request.
     */
    protected FacesContext context() {
        return (FacesContext.getCurrentInstance());
    }

    /**
     * <p>Add a localized message to the
     * <code>FacesContext</code> for the current request.</p>
     *
     * @param clientId Client identifier of the component this message relates
     * to, or <code>null</code> for global messages
     * @param key Message key of the message to include
     */
    protected void message(String clientId, String key) {
        // Look up the requested message text
        String text;

        try {
            ResourceBundle bundle = ResourceBundle.getBundle(
                    "com.sms.forex.web.messages.Messages",
                    context().getViewRoot().getLocale());
            text = bundle.getString(key);
        } catch (Exception e) {
            text = "???" + key + "???";
        }

        // Construct and add a FacesMessage containing it
        context().addMessage(clientId, new FacesMessage(text));
    }

    /**
     * <p>Add a localized message to the
     * <code>FacesContext</code> for the current request.</p>
     *
     * @param clientId Client identifier of the component this message relates
     * to, or <code>null</code> for global messages
     * @param key Message key of the message to include
     * @param params Substitution parameters for using the localized text as a
     * message format
     */
    protected void message(String clientId, String key, Object[] params) {
        // Look up the requested message text
        String text;

        try {
            ResourceBundle bundle = ResourceBundle.getBundle(
                    "com.sms.forex..web.messages.Messages",
                    context().getViewRoot().getLocale());
            text = bundle.getString(key);
        } catch (Exception e) {
            text = "???" + key + "???";
        }

        // Perform the requested substitutions
        if ((params != null) && (params.length > 0)) {
            text = MessageFormat.format(text, params);
        }

        // Construct and add a FacesMessage containing it
        context().addMessage(clientId, new FacesMessage(text));
    }
}
