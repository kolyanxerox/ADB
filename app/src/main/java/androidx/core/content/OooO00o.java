package androidx.core.content;

import androidx.core.util.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Consumer {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15199OooOo0O;

    public /* synthetic */ OooO00o(int i) {
        this.f15199OooOo0O = i;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        String str = (String) obj;
        switch (this.f15199OooOo0O) {
            case 0:
                IntentSanitizer.lambda$sanitizeByThrowing$1(str);
                break;
            default:
                IntentSanitizer.lambda$sanitizeByFiltering$0(str);
                break;
        }
    }
}
