package androidx.datastore.preferences.protobuf;

import Oooo0OO.oo000o;
import Oooo0o.OooO0O0;
import Oooo0o.OooO0OO;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.impl.C1268v4;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdListener;
import com.applovin.shadow.okio.Path;
import com.google.android.gms.internal.ads.AbstractC1641hg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract /* synthetic */ class OooO00o {
    public static String OooO(Path path, String str) {
        return str + path;
    }

    public static int OooO00o(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int OooO0O0(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static OooO0O0 OooO0OO(Parcel parcel) {
        OooO0O0 oooO0O0O000O0o0 = OooO0OO.o000O0o0(parcel.readStrongBinder());
        parcel.recycle();
        return oooO0O0O000O0o0;
    }

    public static C1268v4 OooO0Oo(String str, long j, TimeUnit timeUnit) {
        return C1268v4.m3549a(str, Long.valueOf(timeUnit.toMillis(j)));
    }

    public static String OooO0o(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static ClassCastException OooO0o0(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String OooO0oO(char c, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String OooO0oo(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    public static String OooOO0(Class cls, StringBuilder sb) {
        sb.append(cls.getCanonicalName());
        return sb.toString();
    }

    public static String OooOO0O(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String OooOO0o(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String OooOOO(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String OooOOO0(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String OooOOOO(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static /* synthetic */ String OooOOOo(CharSequence[] charSequenceArr) {
        StringBuilder sb = new StringBuilder();
        if (charSequenceArr.length > 0) {
            sb.append(charSequenceArr[0]);
            for (int i = 1; i < charSequenceArr.length; i++) {
                sb.append((CharSequence) ",");
                sb.append(charSequenceArr[i]);
            }
        }
        return sb.toString();
    }

    public static HashMap OooOOo(String str, String str2) {
        HashMap map = new HashMap();
        map.put(str, str2);
        return map;
    }

    public static StringBuilder OooOOo0(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static JSONArray OooOOoo(String str, JSONObject jSONObject) {
        return JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
    }

    public static /* synthetic */ void OooOo(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void OooOo0(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void OooOo00(int i, String str, String str2) {
        AbstractC1641hg.OooOOo0(str2, str + i);
    }

    public static void OooOo0O(oo000o oo000oVar, Bundle bundle, String str) {
        oo000oVar.getClass();
        bundle.putLong(str, System.currentTimeMillis());
    }

    public static /* synthetic */ void OooOo0o(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void OooOoO(String str, String str2, String str3) {
        AbstractC1641hg.OooOOo0(str3, str2.concat(String.valueOf(str)));
    }

    public static void OooOoO0(String str, String str2, C1240o c1240o, String str3) {
        c1240o.m3211a(str3, str + str2);
    }

    public static void OooOoOO(String str, String str2, ArrayList arrayList) {
        arrayList.add(new Pair(str, str2));
    }

    public static void OooOoo(StringBuilder sb, String str, C1240o c1240o, String str2) {
        sb.append(str);
        c1240o.m3211a(str2, sb.toString());
    }

    public static void OooOoo0(StringBuilder sb, MaxAdListener maxAdListener, C1240o c1240o, String str) {
        sb.append(maxAdListener);
        c1240o.m3211a(str, sb.toString());
    }

    public static void OooOooO(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }
}
