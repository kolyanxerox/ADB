package io.flutter.plugins.webviewflutter;

/* loaded from: classes3.dex */
public final class AndroidWebKitError extends Throwable {
    private final String code;
    private final Object details;
    private final String message;

    public /* synthetic */ AndroidWebKitError(String str, String str2, Object obj, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : obj);
    }

    public final String getCode() {
        return this.code;
    }

    public final Object getDetails() {
        return this.details;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public AndroidWebKitError(String code, String str, Object obj) {
        kotlin.jvm.internal.OooOo.OooO0o0(code, "code");
        this.code = code;
        this.message = str;
        this.details = obj;
    }
}
