package com.unity3d.services.ads.api;

import Oooo.OooOOOO;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;
import o000ooOO.o000OO0O;

/* loaded from: classes3.dex */
public class GMAScar {
    private static final GMAScarAdapterBridge gmaScarAdapterBridge = GMA.getInstance().getBridge();

    @WebViewExposed
    public static void getSCARSignal(String str, String str2, WebViewCallback webViewCallback) throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, PackageManager.NameNotFoundException, ClassNotFoundException, SecurityException, IllegalArgumentException, OooOOOO, InvocationTargetException {
        gmaScarAdapterBridge.getSCARSignal(str, o000OO0O.valueOf(str2.toUpperCase()));
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void getVersion(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        gmaScarAdapterBridge.getVersion();
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void initializeScar(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        gmaScarAdapterBridge.initializeScar();
        webViewCallback.invoke(new Object[0]);
    }

    public static void isInitialized(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        gmaScarAdapterBridge.isInitialized();
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void load(String str, String str2, Boolean bool, String str3, String str4, Integer num, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        gmaScarAdapterBridge.load(bool.booleanValue(), str, str2, str4, str3, num.intValue());
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void show(String str, String str2, Boolean bool, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        gmaScarAdapterBridge.show(str, str2);
        webViewCallback.invoke(new Object[0]);
    }
}
