package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class qp0 implements Executor {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final qp0 f23673OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ qp0[] f23674OooOo0o;

    static {
        qp0 qp0Var = new qp0("INSTANCE", 0);
        f23673OooOo0O = qp0Var;
        f23674OooOo0o = new qp0[]{qp0Var};
    }

    public static qp0[] values() {
        return (qp0[]) f23674OooOo0o.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
