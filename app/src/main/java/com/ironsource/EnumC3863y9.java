package com.ironsource;

/* renamed from: com.ironsource.y9 */
/* loaded from: classes2.dex */
public enum EnumC3863y9 {
    IADS("iads"),
    UADS("uads"),
    SHARED("shared"),
    NONE("none");


    /* renamed from: b */
    public static final a f12733b = new a(null);

    /* renamed from: a */
    private final String f12739a;

    /* renamed from: com.ironsource.y9$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        public final EnumC3863y9 m13179a(String str) {
            EnumC3863y9 enumC3863y9;
            EnumC3863y9[] enumC3863y9ArrValues = EnumC3863y9.values();
            int length = enumC3863y9ArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    enumC3863y9 = null;
                    break;
                }
                enumC3863y9 = enumC3863y9ArrValues[i];
                if (kotlin.jvm.internal.OooOo.OooO00o(enumC3863y9.m13178b(), str)) {
                    break;
                }
                i++;
            }
            return enumC3863y9 == null ? EnumC3863y9.NONE : enumC3863y9;
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    EnumC3863y9(String str) {
        this.f12739a = str;
    }

    /* renamed from: a */
    public static final EnumC3863y9 m13176a(String str) {
        return f12733b.m13179a(str);
    }

    /* renamed from: b */
    public final String m13178b() {
        return this.f12739a;
    }
}
