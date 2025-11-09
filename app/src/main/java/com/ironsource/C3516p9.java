package com.ironsource;

/* renamed from: com.ironsource.p9 */
/* loaded from: classes2.dex */
public final class C3516p9 {

    /* renamed from: a */
    private final Throwable f10814a;

    /* renamed from: b */
    private final String f10815b;

    /* renamed from: c */
    private final boolean f10816c;

    public C3516p9(Throwable throwable) {
        kotlin.jvm.internal.OooOo.OooO0o0(throwable, "throwable");
        this.f10814a = throwable;
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        kotlin.jvm.internal.OooOo.OooO0Oo(stackTrace, "throwable.stackTrace");
        sb.append(throwable.toString());
        sb.append(System.lineSeparator());
        boolean z = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString());
            sb.append(";" + System.lineSeparator());
            String string = stackTraceElement.toString();
            kotlin.jvm.internal.OooOo.OooO0Oo(string, "elem.toString()");
            String strM11522e = C3551q9.m11517d().m11522e();
            kotlin.jvm.internal.OooOo.OooO0Oo(strM11522e, "getInstance().keyword");
            if (o00O0oO.o000000.Oooo0o(strM11522e, string)) {
                z = true;
            }
        }
        Throwable cause = this.f10814a.getCause();
        if (cause != null) {
            sb.append("--CAUSE");
            sb.append(System.lineSeparator());
            sb.append(cause.toString());
            sb.append(System.lineSeparator());
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            kotlin.jvm.internal.OooOo.OooO0Oo(stackTrace2, "cause.stackTrace");
            for (StackTraceElement stackTraceElement2 : stackTrace2) {
                sb.append(stackTraceElement2.toString());
                sb.append(";" + System.lineSeparator());
                String string2 = stackTraceElement2.toString();
                kotlin.jvm.internal.OooOo.OooO0Oo(string2, "elem.toString()");
                String strM11522e2 = C3551q9.m11517d().m11522e();
                kotlin.jvm.internal.OooOo.OooO0Oo(strM11522e2, "getInstance().keyword");
                if (o00O0oO.o000000.Oooo0o(strM11522e2, string2)) {
                    z = true;
                }
            }
        }
        String string3 = sb.toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string3, "builder.toString()");
        this.f10815b = string3;
        this.f10816c = z;
    }

    /* renamed from: a */
    public static /* synthetic */ C3516p9 m11365a(C3516p9 c3516p9, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = c3516p9.f10814a;
        }
        return c3516p9.m11366a(th);
    }

    /* renamed from: b */
    public final String m11368b() {
        return this.f10815b;
    }

    /* renamed from: c */
    public final Throwable m11369c() {
        return this.f10814a;
    }

    /* renamed from: d */
    public final boolean m11370d() {
        return this.f10816c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3516p9) && kotlin.jvm.internal.OooOo.OooO00o(this.f10814a, ((C3516p9) obj).f10814a);
    }

    public int hashCode() {
        return this.f10814a.hashCode();
    }

    public String toString() {
        return "CrashReportWrapper(throwable=" + this.f10814a + ')';
    }

    /* renamed from: a */
    public final C3516p9 m11366a(Throwable throwable) {
        kotlin.jvm.internal.OooOo.OooO0o0(throwable, "throwable");
        return new C3516p9(throwable);
    }

    /* renamed from: a */
    public final Throwable m11367a() {
        return this.f10814a;
    }
}
