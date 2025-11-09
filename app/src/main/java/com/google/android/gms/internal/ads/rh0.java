package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.view.View;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class rh0 implements hl0, uy0, InterfaceC1770kz {

    /* renamed from: OooOo0O */
    public final Object f23865OooOo0O;

    public /* synthetic */ rh0(d61 d61Var, y81 y81Var, e91 e91Var, IOException iOException, boolean z) {
        this.f23865OooOo0O = iOException;
    }

    public JSONObject OooO00o(View view) throws JSONException {
        int currentModeType;
        JSONObject jSONObjectOooO00o = wh0.OooO00o(0, 0, 0, 0);
        UiModeManager uiModeManager = af0.f17035OooO0oo;
        int i = (uiModeManager == null || (currentModeType = uiModeManager.getCurrentModeType()) == 1 || currentModeType != 4) ? 2 : af0.f17027OooO;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        try {
            jSONObjectOooO00o.put("noOutputDevice", i2 == 0);
            return jSONObjectOooO00o;
        } catch (JSONException e) {
            ze0.OooOOO(e, "Error with setting output device status");
            return jSONObjectOooO00o;
        }
    }

    public void OooO0O0(int i, Object obj, g11 g11Var) {
        rz0 rz0Var = (rz0) this.f23865OooOo0O;
        rz0Var.o000000o(i, 3);
        g11Var.OooO0Oo((bz0) obj, rz0Var.f23960OooOo0o);
        rz0Var.o000000o(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.hl0
    public /* bridge */ /* synthetic */ Iterator OooO0Oo(ni0 ni0Var, CharSequence charSequence) {
        return new cl0(charSequence, (uk0) this.f23865OooOo0O, 0);
    }

    @Override // com.google.android.gms.internal.ads.uy0
    public Object zza(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            Provider provider = Security.getProvider(strArr[i2]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        while (true) {
            qv0 qv0Var = (qv0) this.f23865OooOo0O;
            if (i >= size) {
                return qv0Var.OooO0o(str, null);
            }
            Object obj = arrayList.get(i);
            i++;
            try {
                return qv0Var.OooO0o(str, (Provider) obj);
            } catch (Exception unused) {
            }
        }
    }

    public /* synthetic */ rh0(Object obj) {
        this.f23865OooOo0O = obj;
    }

    public rh0(rz0 rz0Var) {
        Charset charset = i01.f19888OooO00o;
        this.f23865OooOo0O = rz0Var;
        rz0Var.f23960OooOo0o = this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1770kz
    /* renamed from: zza */
    public void mo13701zza(Object obj) {
        ((e61) obj).OooO0OO((IOException) this.f23865OooOo0O);
    }
}
