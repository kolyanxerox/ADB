package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.w */
/* loaded from: classes2.dex */
public final class C3785w implements InterfaceC3304ku<JSONObject>, InterfaceC3234iu<C3716u> {

    /* renamed from: a */
    private final Map<String, C3102f2> f12430a = new LinkedHashMap();

    /* renamed from: b */
    private int f12431b;

    /* renamed from: com.ironsource.w$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12432a;

        static {
            int[] iArr = new int[EnumC3200hu.values().length];
            try {
                iArr[EnumC3200hu.LoadRequest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3200hu.LoadSuccess.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3200hu.ShowSuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3200hu.ShowFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC3200hu.Destroyed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f12432a = iArr;
        }
    }

    /* renamed from: a */
    public final int m12835a() {
        return this.f12431b;
    }

    @Override // com.ironsource.InterfaceC3075ef
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject mo8475a(EnumC3269ju mode) throws JSONException {
        kotlin.jvm.internal.OooOo.OooO0o0(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C3102f2> entry : this.f12430a.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObjectMo8475a = entry.getValue().mo8475a(mode);
            if (jSONObjectMo8475a.length() > 0) {
                jSONObject.put(key, jSONObjectMo8475a);
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    private final void m12834b(C3716u c3716u) {
        int i;
        int i2;
        int i3 = a.f12432a[c3716u.m12500f().ordinal()];
        if (i3 == 2) {
            i = this.f12431b + 1;
        } else if ((i3 != 3 && i3 != 4 && i3 != 5) || (i2 = this.f12431b) <= 0) {
            return;
        } else {
            i = i2 - 1;
        }
        this.f12431b = i;
    }

    @Override // com.ironsource.InterfaceC3234iu
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo8604a(C3716u record) {
        kotlin.jvm.internal.OooOo.OooO0o0(record, "record");
        String strM12497c = record.m12497c();
        Map<String, C3102f2> map = this.f12430a;
        C3102f2 c3102f2 = map.get(strM12497c);
        if (c3102f2 == null) {
            c3102f2 = new C3102f2();
            map.put(strM12497c, c3102f2);
        }
        c3102f2.mo8604a(record.m12494a(new C3751v()));
        m12834b(record);
    }

    /* renamed from: b */
    public final boolean m12837b() {
        return !this.f12430a.isEmpty();
    }
}
