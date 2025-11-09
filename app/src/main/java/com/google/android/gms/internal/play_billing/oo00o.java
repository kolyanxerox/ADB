package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class oo00o implements Executor {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final oo00o f27205OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ oo00o[] f27206OooOo0o;

    static {
        oo00o oo00oVar = new oo00o("INSTANCE", 0);
        f27205OooOo0O = oo00oVar;
        f27206OooOo0o = new oo00o[]{oo00oVar};
    }

    public static oo00o[] values() {
        return (oo00o[]) f27206OooOo0o.clone();
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
