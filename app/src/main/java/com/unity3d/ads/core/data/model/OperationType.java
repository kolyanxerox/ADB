package com.unity3d.ads.core.data.model;

import java.util.Locale;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public enum OperationType {
    UNKNOWN,
    INITIALIZATION,
    LOAD,
    LOAD_HEADER_BIDDING,
    SHOW,
    REFRESH,
    PRIVACY_UPDATE,
    INITIALIZATION_COMPLETED,
    TRANSACTION_EVENT,
    GET_TOKEN,
    UNIVERSAL_EVENT;

    @Override // java.lang.Enum
    public String toString() {
        String string = super.toString();
        Locale locale = Locale.getDefault();
        OooOo.OooO0Oo(locale, "getDefault()");
        String lowerCase = string.toLowerCase(locale);
        OooOo.OooO0Oo(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
