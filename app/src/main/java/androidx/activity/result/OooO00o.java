package androidx.activity.result;

import o00O0Oo.Oooo000;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements ActivityResultCallback {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f15170OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f15171OooO0O0;

    public /* synthetic */ OooO00o(int i, Oooo000 oooo000) {
        this.f15170OooO00o = i;
        this.f15171OooO0O0 = oooo000;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        switch (this.f15170OooO00o) {
            case 0:
                this.f15171OooO0O0.invoke(obj);
                break;
            default:
                this.f15171OooO0O0.invoke(obj);
                break;
        }
    }
}
