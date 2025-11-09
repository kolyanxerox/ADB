package com.ironsource.sdk.controller;

import com.ironsource.C2941al;
import com.ironsource.C3454nh;
import com.ironsource.C3551q9;
import com.ironsource.C3764vc;
import com.ironsource.C3769vh;
import com.ironsource.C3832xc;
import com.ironsource.C3908zk;
import com.ironsource.InterfaceC3602rp;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.j */
/* loaded from: classes2.dex */
class C3645j {

    /* renamed from: a */
    private final String f11564a;

    /* renamed from: b */
    private final C3832xc f11565b;

    /* renamed from: com.ironsource.sdk.controller.j$a */
    public class a implements InterfaceC3602rp {

        /* renamed from: a */
        final /* synthetic */ C2941al f11566a;

        /* renamed from: b */
        final /* synthetic */ C3908zk f11567b;

        public a(C2941al c2941al, C3908zk c3908zk) {
            this.f11566a = c2941al;
            this.f11567b = c3908zk;
        }

        @Override // com.ironsource.InterfaceC3602rp
        /* renamed from: a */
        public void mo8059a(C3769vh c3769vh) {
            try {
                C2941al c2941al = this.f11566a;
                C3908zk c3908zk = this.f11567b;
                c2941al.m7822b(c3908zk, C3645j.this.m12045a(c3908zk, c3769vh.m12784a()));
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.InterfaceC3602rp
        /* renamed from: a */
        public void mo8060a(C3769vh c3769vh, C3454nh c3454nh) {
            try {
                C2941al c2941al = this.f11566a;
                C3908zk c3908zk = this.f11567b;
                c2941al.m7821a(c3908zk, C3645j.this.m12044a(c3908zk, c3454nh.m10992b()));
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    public C3645j(String str, C3832xc c3832xc) {
        this.f11564a = str;
        this.f11565b = c3832xc;
    }

    /* renamed from: a */
    private InterfaceC3602rp m12039a(C3908zk c3908zk, C2941al c2941al) {
        return new a(c2941al, c3908zk);
    }

    /* renamed from: b */
    private C3769vh m12046b(JSONObject jSONObject, String str) throws Exception {
        if (!jSONObject.has(C3764vc.c.f12348c) || !jSONObject.has(C3764vc.c.f12347b)) {
            throw new Exception(C3764vc.a.f12332a);
        }
        String string = jSONObject.getString(C3764vc.c.f12348c);
        return new C3769vh(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString(C3764vc.c.f12347b));
    }

    /* renamed from: a */
    private C3769vh m12040a(JSONObject jSONObject, String str) throws Exception {
        if (jSONObject.has(C3764vc.c.f12349d)) {
            return new C3769vh(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString(C3764vc.c.f12349d)));
        }
        throw new Exception(C3764vc.a.f12333b);
    }

    /* renamed from: a */
    private JSONObject m12043a(C3908zk c3908zk, long j) {
        try {
            return c3908zk.m13409e().put("result", j);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public JSONObject m12044a(C3908zk c3908zk, String str) {
        try {
            return c3908zk.m13409e().put("errMsg", str);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public JSONObject m12045a(C3908zk c3908zk, JSONObject jSONObject) {
        try {
            return c3908zk.m13409e().put("result", jSONObject);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m12047a(org.json.JSONObject r10, com.ironsource.InterfaceC3874yk r11) {
        /*
            r9 = this;
            com.ironsource.zk r1 = new com.ironsource.zk
            r1.<init>(r10)
            com.ironsource.al r10 = new com.ironsource.al
            r10.<init>(r11)
            java.lang.String r11 = r1.m13406b()     // Catch: java.lang.Exception -> L34
            org.json.JSONObject r0 = r1.m13407c()     // Catch: java.lang.Exception -> L34
            java.lang.String r2 = r9.f11564a     // Catch: java.lang.Exception -> L34
            com.ironsource.vh r4 = r9.m12046b(r0, r2)     // Catch: java.lang.Exception -> L34
            java.lang.String r2 = r9.f11564a     // Catch: java.lang.Exception -> L34
            com.ironsource.sdk.utils.IronSourceStorageUtils.ensurePathSafety(r4, r2)     // Catch: java.lang.Exception -> L34
            int r2 = r11.hashCode()     // Catch: java.lang.Exception -> L34
            r3 = 2
            r5 = 4
            r6 = 5
            r7 = 1
            r8 = 3
            switch(r2) {
                case -2073025383: goto L60;
                case -1137024519: goto L56;
                case -318115535: goto L4c;
                case 537556755: goto L42;
                case 1764172231: goto L38;
                case 1953259713: goto L2a;
                default: goto L29;
            }     // Catch: java.lang.Exception -> L34
        L29:
            goto L6a
        L2a:
            java.lang.String r2 = "getFiles"
            boolean r11 = r11.equals(r2)     // Catch: java.lang.Exception -> L34
            if (r11 == 0) goto L6a
            r11 = r8
            goto L6b
        L34:
            r0 = move-exception
            r11 = r0
            goto Ld2
        L38:
            java.lang.String r2 = "deleteFile"
            boolean r11 = r11.equals(r2)     // Catch: java.lang.Exception -> L34
            if (r11 == 0) goto L6a
            r11 = r7
            goto L6b
        L42:
            java.lang.String r2 = "updateAttributesOfFile"
            boolean r11 = r11.equals(r2)     // Catch: java.lang.Exception -> L34
            if (r11 == 0) goto L6a
            r11 = r6
            goto L6b
        L4c:
            java.lang.String r2 = "getTotalSizeOfFiles"
            boolean r11 = r11.equals(r2)     // Catch: java.lang.Exception -> L34
            if (r11 == 0) goto L6a
            r11 = r5
            goto L6b
        L56:
            java.lang.String r2 = "deleteFolder"
            boolean r11 = r11.equals(r2)     // Catch: java.lang.Exception -> L34
            if (r11 == 0) goto L6a
            r11 = r3
            goto L6b
        L60:
            java.lang.String r2 = "saveFile"
            boolean r11 = r11.equals(r2)     // Catch: java.lang.Exception -> L34
            if (r11 == 0) goto L6a
            r11 = 0
            goto L6b
        L6a:
            r11 = -1
        L6b:
            if (r11 == 0) goto Lb6
            if (r11 == r7) goto La8
            if (r11 == r3) goto L9e
            if (r11 == r8) goto L97
            if (r11 == r5) goto L8c
            if (r11 == r6) goto L78
            goto Le4
        L78:
            java.lang.String r11 = "attributesToUpdate"
            org.json.JSONObject r11 = r0.optJSONObject(r11)     // Catch: java.lang.Exception -> L34
            com.ironsource.xc r0 = r9.f11565b     // Catch: java.lang.Exception -> L34
            r0.m13045a(r4, r11)     // Catch: java.lang.Exception -> L34
            org.json.JSONObject r11 = r4.m12784a()     // Catch: java.lang.Exception -> L34
        L87:
            org.json.JSONObject r11 = r9.m12045a(r1, r11)     // Catch: java.lang.Exception -> L34
            goto Lb2
        L8c:
            com.ironsource.xc r11 = r9.f11565b     // Catch: java.lang.Exception -> L34
            long r2 = r11.m13048d(r4)     // Catch: java.lang.Exception -> L34
            org.json.JSONObject r11 = r9.m12043a(r1, r2)     // Catch: java.lang.Exception -> L34
            goto Lb2
        L97:
            com.ironsource.xc r11 = r9.f11565b     // Catch: java.lang.Exception -> L34
            org.json.JSONObject r11 = r11.m13047c(r4)     // Catch: java.lang.Exception -> L34
            goto L87
        L9e:
            com.ironsource.xc r11 = r9.f11565b     // Catch: java.lang.Exception -> L34
            r11.m13046b(r4)     // Catch: java.lang.Exception -> L34
            org.json.JSONObject r11 = r4.m12784a()     // Catch: java.lang.Exception -> L34
            goto L87
        La8:
            com.ironsource.xc r11 = r9.f11565b     // Catch: java.lang.Exception -> L34
            r11.m13043a(r4)     // Catch: java.lang.Exception -> L34
            org.json.JSONObject r11 = r4.m12784a()     // Catch: java.lang.Exception -> L34
            goto L87
        Lb2:
            r10.m7822b(r1, r11)     // Catch: java.lang.Exception -> L34
            return
        Lb6:
            java.lang.String r11 = "fileUrl"
            java.lang.String r5 = r0.optString(r11)     // Catch: java.lang.Exception -> L34
            java.lang.String r11 = "connectionTimeout"
            int r6 = r0.optInt(r11)     // Catch: java.lang.Exception -> L34
            java.lang.String r11 = "readTimeout"
            int r7 = r0.optInt(r11)     // Catch: java.lang.Exception -> L34
            com.ironsource.rp r8 = r9.m12039a(r1, r10)     // Catch: java.lang.Exception -> L34
            com.ironsource.xc r3 = r9.f11565b     // Catch: java.lang.Exception -> L34
            r3.m13044a(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L34
            return
        Ld2:
            com.ironsource.q9 r0 = com.ironsource.C3551q9.m11517d()
            r0.m11519a(r11)
            java.lang.String r11 = r11.getMessage()
            org.json.JSONObject r11 = r9.m12044a(r1, r11)
            r10.m7821a(r1, r11)
        Le4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C3645j.m12047a(org.json.JSONObject, com.ironsource.yk):void");
    }
}
