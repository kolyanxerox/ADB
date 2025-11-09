package com.ironsource.mediationsdk.adquality;

import com.ironsource.C3451ne;
import com.ironsource.C3838xi;
import com.ironsource.EnumC3745us;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.ironsource.mediationsdk.adquality.a */
/* loaded from: classes2.dex */
public final class C3365a {

    /* renamed from: a */
    public static final b f9555a = new b(null);

    /* renamed from: b */
    private static a f9556b = a.DONT_INITIALIZE;

    /* renamed from: com.ironsource.mediationsdk.adquality.a$a */
    public enum a {
        DONT_INITIALIZE(0),
        LEVELPLAY_ONLY(1),
        ALL_MEDIATIONS(2),
        OTHER_ONLY(3);


        /* renamed from: b */
        public static final C4580a f9557b = new C4580a(null);

        /* renamed from: a */
        private final int f9563a;

        /* renamed from: com.ironsource.mediationsdk.adquality.a$a$a, reason: collision with other inner class name */
        public static final class C4580a {
            private C4580a() {
            }

            /* renamed from: a */
            public final a m10050a(int i) {
                a aVar;
                a[] aVarArrValues = a.values();
                int length = aVarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = aVarArrValues[i2];
                    if (aVar.m10049b() == i) {
                        break;
                    }
                    i2++;
                }
                return aVar == null ? a.DONT_INITIALIZE : aVar;
            }

            public /* synthetic */ C4580a(OooOO0O oooOO0O) {
                this();
            }
        }

        a(int i) {
            this.f9563a = i;
        }

        /* renamed from: b */
        public final int m10049b() {
            return this.f9563a;
        }
    }

    /* renamed from: com.ironsource.mediationsdk.adquality.a$b */
    public static final class b {
        private b() {
        }

        /* renamed from: a */
        public final a m10051a() {
            return C3365a.f9556b;
        }

        public /* synthetic */ b(OooOO0O oooOO0O) {
            this();
        }

        /* renamed from: a */
        public final void m10052a(a aVar) {
            OooOo.OooO0o0(aVar, "<set-?>");
            C3365a.f9556b = aVar;
        }
    }

    /* renamed from: com.ironsource.mediationsdk.adquality.a$c */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9564a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.LEVELPLAY_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.ALL_MEDIATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.OTHER_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9564a = iArr;
        }
    }

    /* renamed from: b */
    public final boolean m10047b() throws JSONException {
        EnumC3745us enumC3745us;
        EnumC3745us enumC3745us2;
        JSONArray jSONArrayOptJSONArray = new C3838xi().m13068a().optJSONArray(C3451ne.f10473f0);
        if (jSONArrayOptJSONArray == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            int i2 = jSONArrayOptJSONArray.getInt(i);
            EnumC3745us[] enumC3745usArrValues = EnumC3745us.values();
            int length2 = enumC3745usArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    enumC3745us2 = null;
                    break;
                }
                enumC3745us2 = enumC3745usArrValues[i3];
                if (enumC3745us2.m12716b() == i2) {
                    break;
                }
                i3++;
            }
            if (enumC3745us2 != null) {
                linkedHashSet.add(enumC3745us2);
            }
        }
        int i4 = c.f9564a[f9556b.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    enumC3745us = EnumC3745us.EXTERNAL_MEDIATION_INIT;
                }
            } else if (linkedHashSet.contains(EnumC3745us.LEVEL_PLAY_INIT) || linkedHashSet.contains(EnumC3745us.EXTERNAL_MEDIATION_INIT)) {
                return true;
            }
            return false;
        }
        enumC3745us = EnumC3745us.LEVEL_PLAY_INIT;
        return linkedHashSet.contains(enumC3745us);
    }

    /* renamed from: a */
    public final void m10046a(int i) {
        f9556b = a.f9557b.m10050a(i);
    }
}
