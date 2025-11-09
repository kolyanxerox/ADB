package io.flutter.plugins.webviewflutter;

/* loaded from: classes3.dex */
public final class ResultCompat<T> {
    public static final Companion Companion = new Companion(null);
    private final Throwable exception;
    private final boolean isFailure;
    private final boolean isSuccess;
    private final Object result;
    private final T value;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oo00o.OooOo asCompatCallback$lambda$0(o00O0Oo.Oooo000 oooo000, oo00o.OooOOO0 oooOOO0) {
            oooo000.invoke(new ResultCompat(oooOOO0.f33191OooOo0O));
            return oo00o.OooOo.f33195OooO00o;
        }

        public final <T> o00O0Oo.Oooo000 asCompatCallback(o00O0Oo.Oooo000 result) {
            kotlin.jvm.internal.OooOo.OooO0o0(result, "result");
            return new Oooo000(result, 2);
        }

        public final <T> void success(T t, Object callback) {
            kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
            kotlin.jvm.internal.o0O0O00.OooO0O0(1, callback);
            ((o00O0Oo.Oooo000) callback).invoke(new oo00o.OooOOO0(t));
        }

        private Companion() {
        }
    }

    public ResultCompat(Object obj) {
        this.result = obj;
        boolean z = obj instanceof oo00o.OooOO0O;
        this.value = z ? null : (T) obj;
        this.exception = oo00o.OooOOO0.OooO00o(obj);
        this.isSuccess = !z;
        this.isFailure = z;
    }

    public static final <T> o00O0Oo.Oooo000 asCompatCallback(o00O0Oo.Oooo000 oooo000) {
        return Companion.asCompatCallback(oooo000);
    }

    public static final <T> void success(T t, Object obj) {
        Companion.success(t, obj);
    }

    public final Throwable exceptionOrNull() {
        return this.exception;
    }

    public final T getOrNull() {
        return this.value;
    }

    /* renamed from: getResult-d1pmJ48, reason: not valid java name */
    public final Object m13861getResultd1pmJ48() {
        return this.result;
    }

    public final boolean isFailure() {
        return this.isFailure;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }
}
