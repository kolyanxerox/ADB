package com.ironsource;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.C3764vc;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.xc */
/* loaded from: classes2.dex */
public class C3832xc {

    /* renamed from: a */
    private final Context f12605a;

    /* renamed from: b */
    private final C3146gb f12606b;

    /* renamed from: c */
    private final HandlerC3798wc f12607c;

    /* renamed from: d */
    private final C3600rn f12608d;

    /* renamed from: e */
    private final InterfaceC3767vf f12609e = C3495on.m11199U().mo8686f();

    /* renamed from: com.ironsource.xc$a */
    public class a implements InterfaceC3602rp {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3602rp f12610a;

        /* renamed from: com.ironsource.xc$a$a, reason: collision with other inner class name */
        public class C4589a extends JSONObject {
            public C4589a() throws JSONException {
                put("lastReferencedTime", System.currentTimeMillis());
            }
        }

        public a(InterfaceC3602rp interfaceC3602rp) {
            this.f12610a = interfaceC3602rp;
        }

        @Override // com.ironsource.InterfaceC3602rp
        /* renamed from: a */
        public void mo8059a(C3769vh c3769vh) {
            this.f12610a.mo8059a(c3769vh);
            try {
                C3832xc.this.f12608d.m11740a(c3769vh.getName(), new C4589a());
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.InterfaceC3602rp
        /* renamed from: a */
        public void mo8060a(C3769vh c3769vh, C3454nh c3454nh) {
            this.f12610a.mo8060a(c3769vh, c3454nh);
        }
    }

    public C3832xc(Context context, C3146gb c3146gb, HandlerC3798wc handlerC3798wc, C3600rn c3600rn) {
        this.f12605a = context;
        this.f12606b = c3146gb;
        this.f12607c = handlerC3798wc;
        this.f12608d = c3600rn;
    }

    /* renamed from: b */
    public void m13046b(C3769vh c3769vh) throws Exception {
        if (c3769vh.exists()) {
            ArrayList<C3769vh> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(c3769vh);
            if (!IronSourceStorageUtils.deleteFolderContentRecursive(c3769vh) || !c3769vh.delete()) {
                throw new Exception("Failed to delete folder");
            }
            this.f12608d.m11741a(filesInFolderRecursive);
        }
    }

    /* renamed from: c */
    public JSONObject m13047c(C3769vh c3769vh) throws Exception {
        if (c3769vh.exists()) {
            return IronSourceStorageUtils.buildFilesMapOfDirectory(c3769vh, this.f12608d.m11742b());
        }
        throw new Exception("Folder does not exist");
    }

    /* renamed from: d */
    public long m13048d(C3769vh c3769vh) throws Exception {
        if (c3769vh.exists()) {
            return IronSourceStorageUtils.getTotalSizeOfDir(c3769vh);
        }
        throw new Exception("Folder does not exist");
    }

    /* renamed from: a */
    public void m13043a(C3769vh c3769vh) throws Exception {
        if (c3769vh.exists()) {
            if (!c3769vh.delete()) {
                throw new Exception("Failed to delete file");
            }
            this.f12608d.m11739a(c3769vh.getName());
        }
    }

    /* renamed from: a */
    public void m13044a(C3769vh c3769vh, String str, int i, int i2, InterfaceC3602rp interfaceC3602rp) throws Exception {
        if (TextUtils.isEmpty(str)) {
            throw new Exception(C3764vc.a.f12332a);
        }
        if (this.f12609e.mo4835a(this.f12606b.m8935a()) <= 0) {
            throw new Exception(C3109f9.f8514A);
        }
        if (!C3896z8.m13306h(this.f12605a)) {
            throw new Exception(C3109f9.f8516C);
        }
        this.f12607c.m12888a(c3769vh.getPath(), new a(interfaceC3602rp));
        if (!c3769vh.exists()) {
            this.f12606b.mo8939a(c3769vh, str, i, i2, this.f12607c);
            return;
        }
        Message message = new Message();
        message.obj = c3769vh;
        message.what = 1015;
        this.f12607c.sendMessage(message);
    }

    /* renamed from: a */
    public void m13045a(C3769vh c3769vh, JSONObject jSONObject) throws Exception {
        if (jSONObject == null) {
            throw new Exception("Missing attributes to update");
        }
        if (!c3769vh.exists()) {
            throw new Exception("File does not exist");
        }
        if (!this.f12608d.m11743b(c3769vh.getName(), jSONObject)) {
            throw new Exception("Failed to update attribute");
        }
    }
}
