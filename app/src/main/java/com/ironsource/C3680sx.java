package com.ironsource;

import android.content.Context;
import com.ironsource.C3034d9;
import com.ironsource.C3419mh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sx */
/* loaded from: classes2.dex */
public class C3680sx {

    /* renamed from: a */
    private final String f11958a;

    /* renamed from: b */
    private Context f11959b;

    /* renamed from: c */
    private C3144g9 f11960c;

    /* renamed from: d */
    private C3796wa f11961d;

    /* renamed from: e */
    private int f11962e;

    /* renamed from: f */
    private C3146gb f11963f;

    /* renamed from: g */
    private int f11964g;

    /* renamed from: h */
    private int f11965h;

    /* renamed from: i */
    private final String f11966i = "sx";

    /* renamed from: j */
    private a f11967j;

    /* renamed from: com.ironsource.sx$a */
    public enum a {
        NOT_RECOVERED,
        RECOVERED,
        IN_RECOVERING,
        NOT_ALLOWED
    }

    public C3680sx(Context context, C3144g9 c3144g9, C3796wa c3796wa, int i, C3146gb c3146gb, String str) {
        a aVarM12313h = m12313h();
        this.f11967j = aVarM12313h;
        if (aVarM12313h != a.NOT_ALLOWED) {
            this.f11959b = context;
            this.f11960c = c3144g9;
            this.f11961d = c3796wa;
            this.f11962e = i;
            this.f11963f = c3146gb;
            this.f11964g = 0;
        }
        this.f11958a = str;
    }

    /* renamed from: h */
    private a m12313h() {
        this.f11965h = FeaturesManager.getInstance().getInitRecoverTrials();
        Logger.m12266i(this.f11966i, "getInitialState mMaxAllowedTrials: " + this.f11965h);
        if (this.f11965h > 0) {
            return a.NOT_RECOVERED;
        }
        Logger.m12266i(this.f11966i, "recovery is not allowed by config");
        return a.NOT_ALLOWED;
    }

    /* renamed from: j */
    private void m12314j() {
        if (this.f11964g != this.f11965h) {
            this.f11967j = a.NOT_RECOVERED;
            return;
        }
        Logger.m12266i(this.f11966i, "handleRecoveringEndedFailed | Reached max trials");
        this.f11967j = a.NOT_ALLOWED;
        m12316a();
    }

    /* renamed from: k */
    private void m12315k() {
        m12316a();
        this.f11967j = a.RECOVERED;
    }

    /* renamed from: a */
    public void m12316a() {
        this.f11959b = null;
        this.f11960c = null;
        this.f11961d = null;
        this.f11963f = null;
    }

    /* renamed from: b */
    public Context m12319b() {
        return this.f11959b;
    }

    /* renamed from: c */
    public String m12320c() {
        return this.f11958a;
    }

    /* renamed from: d */
    public C3144g9 m12321d() {
        return this.f11960c;
    }

    /* renamed from: e */
    public int m12322e() {
        return this.f11962e;
    }

    /* renamed from: f */
    public C3796wa m12323f() {
        return this.f11961d;
    }

    /* renamed from: g */
    public C3146gb m12324g() {
        return this.f11963f;
    }

    /* renamed from: i */
    public JSONObject m12325i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C3034d9.h.f8057A0, m12327m());
            jSONObject.put(C3034d9.h.f8059B0, this.f11964g);
            jSONObject.put(C3034d9.h.f8061C0, this.f11965h);
            return jSONObject;
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject;
        }
    }

    /* renamed from: l */
    public boolean m12326l() {
        return this.f11967j == a.IN_RECOVERING;
    }

    /* renamed from: m */
    public boolean m12327m() {
        return this.f11967j == a.RECOVERED;
    }

    /* renamed from: n */
    public void m12328n() {
        a aVar = this.f11967j;
        a aVar2 = a.IN_RECOVERING;
        if (aVar != aVar2) {
            this.f11964g++;
            Logger.m12266i(this.f11966i, "recoveringStarted - trial number " + this.f11964g);
            this.f11967j = aVar2;
        }
    }

    /* renamed from: a */
    public void m12317a(boolean z) {
        if (this.f11967j != a.IN_RECOVERING) {
            return;
        }
        if (z) {
            m12315k();
        } else {
            m12314j();
        }
    }

    /* renamed from: a */
    public boolean m12318a(C3419mh.c cVar, C3419mh.b bVar) {
        Logger.m12266i(this.f11966i, "shouldRecoverWebController: ");
        a aVar = this.f11967j;
        if (aVar == a.NOT_ALLOWED) {
            Logger.m12266i(this.f11966i, "shouldRecoverWebController: false | recover is not allowed");
            return false;
        }
        if (cVar != C3419mh.c.Native) {
            Logger.m12266i(this.f11966i, "shouldRecoverWebController: false | current controller type is: " + cVar);
            return false;
        }
        if (bVar == C3419mh.b.Loading || bVar == C3419mh.b.None) {
            Logger.m12266i(this.f11966i, "shouldRecoverWebController: false | a Controller is currently loading");
            return false;
        }
        if (aVar == a.RECOVERED) {
            Logger.m12266i(this.f11966i, "shouldRecoverWebController: false | already recovered");
            return false;
        }
        if (aVar == a.IN_RECOVERING) {
            Logger.m12266i(this.f11966i, "shouldRecoverWebController: false | currently in recovering");
            return false;
        }
        if (this.f11959b == null || this.f11960c == null || this.f11961d == null) {
            Logger.m12266i(this.f11966i, "shouldRecoverWebController: false | missing mandatory param");
            return false;
        }
        Logger.m12266i(this.f11966i, "shouldRecoverWebController: true | allow recovering ");
        return true;
    }
}
