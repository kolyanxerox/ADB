package com.ironsource;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.ironsource.y2 */
/* loaded from: classes2.dex */
public class C3856y2 implements Parcelable {
    public static final Parcelable.Creator<C3856y2> CREATOR = new a();

    /* renamed from: a */
    private String f12693a;

    /* renamed from: b */
    private String f12694b;

    /* renamed from: c */
    private String f12695c;

    /* renamed from: d */
    private boolean f12696d;

    /* renamed from: e */
    private int f12697e;

    /* renamed from: f */
    private ArrayList<String> f12698f;

    /* renamed from: g */
    private ArrayList<String> f12699g;

    /* renamed from: h */
    private ArrayList<String> f12700h;

    /* renamed from: i */
    private ArrayList<String> f12701i;

    /* renamed from: j */
    private String f12702j;

    /* renamed from: k */
    private String f12703k;

    /* renamed from: l */
    private Map<String, String> f12704l;

    /* renamed from: com.ironsource.y2$a */
    public class a implements Parcelable.Creator<C3856y2> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3856y2 createFromParcel(Parcel parcel) {
            return new C3856y2(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3856y2[] newArray(int i) {
            return new C3856y2[i];
        }
    }

    public C3856y2() {
        m13123i();
    }

    /* renamed from: a */
    private Map<String, String> m13122a(String str) {
        IronLog ironLog;
        String string;
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            ironLog = IronLog.INTERNAL;
            string = e.toString();
            ironLog.error(string);
            return map;
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            ironLog = IronLog.INTERNAL;
            string = th.toString();
            ironLog.error(string);
            return map;
        }
        return map;
    }

    /* renamed from: i */
    private void m13123i() {
        this.f12696d = false;
        this.f12697e = -1;
        this.f12698f = new ArrayList<>();
        this.f12699g = new ArrayList<>();
        this.f12700h = new ArrayList<>();
        this.f12701i = new ArrayList<>();
        this.f12703k = "";
        this.f12702j = "";
        this.f12704l = new HashMap();
    }

    /* renamed from: b */
    public String m13129b() {
        return this.f12695c;
    }

    /* renamed from: c */
    public int m13132c() {
        return this.f12697e;
    }

    /* renamed from: d */
    public String m13135d() {
        return this.f12702j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Map<String, String> m13138e() {
        return this.f12704l;
    }

    /* renamed from: f */
    public String m13140f() {
        return this.f12703k;
    }

    /* renamed from: g */
    public String m13142g() {
        return this.f12693a;
    }

    /* renamed from: h */
    public String m13144h() {
        return this.f12694b;
    }

    /* renamed from: j */
    public void m13147j(String str) {
        this.f12694b = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("shouldRestore:");
            sb.append(this.f12696d);
            sb.append(", ");
            sb.append("displayedProduct:");
            sb.append(this.f12697e);
            sb.append(", ");
            sb.append("ISReportInit:");
            sb.append(this.f12698f);
            sb.append(", ");
            sb.append("ISInitSuccess:");
            sb.append(this.f12699g);
            sb.append(", ");
            sb.append("ISAppKey");
            sb.append(this.f12702j);
            sb.append(", ");
            sb.append("ISUserId");
            sb.append(this.f12703k);
            sb.append(", ");
            sb.append("ISExtraParams");
            sb.append(this.f12704l);
            sb.append(", ");
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeByte(this.f12696d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f12697e);
            parcel.writeString(this.f12693a);
            parcel.writeString(this.f12694b);
            parcel.writeString(this.f12695c);
            parcel.writeString(this.f12702j);
            parcel.writeString(this.f12703k);
            parcel.writeString(new JSONObject(this.f12704l).toString());
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
        }
    }

    private C3856y2(Parcel parcel) {
        m13123i();
        try {
            this.f12696d = parcel.readByte() != 0;
            this.f12697e = parcel.readInt();
            this.f12693a = parcel.readString();
            this.f12694b = parcel.readString();
            this.f12695c = parcel.readString();
            this.f12702j = parcel.readString();
            this.f12703k = parcel.readString();
            this.f12704l = m13122a(parcel.readString());
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            m13123i();
        }
    }

    /* renamed from: a */
    public void m13124a() {
        this.f12697e = -1;
    }

    /* renamed from: b */
    public void m13130b(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            this.f12701i.remove(str);
        } else if (this.f12701i.indexOf(str) == -1) {
            this.f12701i.add(str);
        }
    }

    /* renamed from: c */
    public void m13133c(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            this.f12698f.remove(str);
        } else if (this.f12698f.indexOf(str) == -1) {
            this.f12698f.add(str);
        }
    }

    /* renamed from: d */
    public void m13136d(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            this.f12700h.remove(str);
        } else if (this.f12700h.indexOf(str) == -1) {
            this.f12700h.add(str);
        }
    }

    /* renamed from: e */
    public boolean m13139e(String str) {
        return !TextUtils.isEmpty(str) && this.f12700h.indexOf(str) > -1;
    }

    /* renamed from: f */
    public void m13141f(String str) {
        this.f12695c = str;
    }

    /* renamed from: g */
    public void m13143g(String str) {
        this.f12702j = str;
    }

    /* renamed from: h */
    public void m13145h(String str) {
        this.f12703k = str;
    }

    /* renamed from: i */
    public void m13146i(String str) {
        this.f12693a = str;
    }

    /* renamed from: j */
    public boolean m13148j() {
        return this.f12696d;
    }

    public /* synthetic */ C3856y2(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public void m13125a(int i) {
        this.f12697e = i;
    }

    /* renamed from: b */
    public boolean m13131b(String str) {
        return !TextUtils.isEmpty(str) && this.f12699g.indexOf(str) > -1;
    }

    /* renamed from: c */
    public boolean m13134c(String str) {
        return !TextUtils.isEmpty(str) && this.f12701i.indexOf(str) > -1;
    }

    /* renamed from: d */
    public boolean m13137d(String str) {
        return !TextUtils.isEmpty(str) && this.f12698f.indexOf(str) > -1;
    }

    /* renamed from: a */
    public void m13126a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            this.f12699g.remove(str);
        } else if (this.f12699g.indexOf(str) == -1) {
            this.f12699g.add(str);
        }
    }

    /* renamed from: a */
    public void m13127a(Map<String, String> map) {
        this.f12704l = map;
    }

    /* renamed from: a */
    public void m13128a(boolean z) {
        this.f12696d = z;
    }
}
