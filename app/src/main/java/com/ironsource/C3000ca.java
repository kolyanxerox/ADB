package com.ironsource;

import android.content.Context;

/* renamed from: com.ironsource.ca */
/* loaded from: classes2.dex */
public final class C3000ca implements InterfaceC3732uf {

    /* renamed from: com.ironsource.ca$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7730a;

        static {
            int[] iArr = new int[EnumC3863y9.values().length];
            try {
                iArr[EnumC3863y9.IADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3863y9.UADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3863y9.SHARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3863y9.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7730a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC3732uf
    /* renamed from: a */
    public InterfaceC3070ea mo8106a(Context context, EnumC3863y9 source) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(source, "source");
        int i = a.f7730a[source.ordinal()];
        if (i == 1) {
            return new C2965ba(context, "supersonic_shared_preferen");
        }
        if (i == 2) {
            return new C2965ba(context, "unityads-installinfo");
        }
        if (i == 3) {
            return new C2965ba(context, C3035da.f8218c);
        }
        if (i == 4) {
            return null;
        }
        throw new OooOOO0.OooO00o();
    }
}
