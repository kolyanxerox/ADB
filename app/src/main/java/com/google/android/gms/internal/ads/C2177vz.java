package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdy;
import java.util.function.Function;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.vz */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2177vz implements Function {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f25145OooO00o;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f25145OooO00o) {
            case 0:
                return ((JSONObject) obj).optJSONArray("flags");
            case 1:
                JSONArray jSONArray = (JSONArray) obj;
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject.optString("key").equals("afma_video_player_type")) {
                        return jSONObjectOptJSONObject.optString("value");
                    }
                }
                return null;
            case 2:
                return Integer.valueOf(Integer.parseInt((String) obj));
            case 3:
                return (BinderC1913ou) BinderC1913ou.class.cast((zzdy) obj);
            default:
                return ((BinderC1913ou) obj).f23121OooOoO0;
        }
    }
}
