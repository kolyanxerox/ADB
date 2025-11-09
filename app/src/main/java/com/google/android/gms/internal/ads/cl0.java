package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* loaded from: classes2.dex */
public final class cl0 extends gl0 {

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ int f18011OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Object f18012OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cl0(CharSequence charSequence, Object obj, int i) {
        super(charSequence);
        this.f18011OooOoOO = i;
        this.f18012OooOoo0 = obj;
    }

    @Override // com.google.android.gms.internal.ads.gl0
    public final int OooO00o(int i) {
        switch (this.f18011OooOoOO) {
            case 0:
                return i + 1;
            default:
                return ((Matcher) ((pd0) this.f18012OooOoo0).f23325OooOo0o).end();
        }
    }

    @Override // com.google.android.gms.internal.ads.gl0
    public final int OooO0O0(int i) {
        switch (this.f18011OooOoOO) {
            case 0:
                CharSequence charSequence = this.f19377OooOo;
                int length = charSequence.length();
                ii0.OooOooO(i, length);
                while (i < length) {
                    if (((uk0) this.f18012OooOoo0).OooO00o(charSequence.charAt(i))) {
                        return i;
                    }
                    i++;
                }
                return -1;
            default:
                pd0 pd0Var = (pd0) this.f18012OooOoo0;
                if (((Matcher) pd0Var.f23325OooOo0o).find(i)) {
                    return ((Matcher) pd0Var.f23325OooOo0o).start();
                }
                return -1;
        }
    }
}
