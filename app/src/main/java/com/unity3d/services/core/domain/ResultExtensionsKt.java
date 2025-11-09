package com.unity3d.services.core.domain;

import com.unity3d.services.core.domain.task.InitializationException;
import kotlin.jvm.internal.OooOo;
import oo00o.OooOOO0;

/* loaded from: classes3.dex */
public final class ResultExtensionsKt {
    public static final <E extends Exception> E getCustomExceptionOrNull(Object obj) {
        OooOOO0.OooO00o(obj);
        OooOo.OooOO0O();
        throw null;
    }

    public static final <E extends Exception> E getCustomExceptionOrThrow(Object obj) {
        OooOOO0.OooO00o(obj);
        OooOo.OooOO0O();
        throw null;
    }

    public static final InitializationException getInitializationExceptionOrNull(Object obj) {
        Throwable thOooO00o = OooOOO0.OooO00o(obj);
        if (thOooO00o instanceof InitializationException) {
            return (InitializationException) thOooO00o;
        }
        return null;
    }

    public static final InitializationException getInitializationExceptionOrThrow(Object obj) {
        Throwable thOooO00o = OooOOO0.OooO00o(obj);
        if (thOooO00o instanceof InitializationException) {
            return (InitializationException) thOooO00o;
        }
        throw new IllegalArgumentException("Wrong Exception type found");
    }
}
