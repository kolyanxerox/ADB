package o00OOOOo;

import androidx.webkit.ProxyConfig;
import com.ironsource.C3262jn;
import com.ironsource.mediationsdk.IronSourceSegment;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import o00OOOoO.o0000O0;

/* loaded from: classes3.dex */
public abstract class OooO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0O0[] f32394OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final Map f32395OooO0O0;

    static {
        OooO0O0 oooO0O0 = new OooO0O0(OooO0O0.f32396OooO, "");
        o0000O0 o0000o02 = OooO0O0.f32398OooO0o;
        OooO0O0 oooO0O02 = new OooO0O0(o0000o02, "GET");
        OooO0O0 oooO0O03 = new OooO0O0(o0000o02, "POST");
        o0000O0 o0000o03 = OooO0O0.f32400OooO0oO;
        OooO0O0 oooO0O04 = new OooO0O0(o0000o03, "/");
        OooO0O0 oooO0O05 = new OooO0O0(o0000o03, "/index.html");
        o0000O0 o0000o04 = OooO0O0.f32401OooO0oo;
        OooO0O0 oooO0O06 = new OooO0O0(o0000o04, ProxyConfig.MATCH_HTTP);
        OooO0O0 oooO0O07 = new OooO0O0(o0000o04, "https");
        o0000O0 o0000o05 = OooO0O0.f32399OooO0o0;
        OooO0O0[] oooO0O0Arr = {oooO0O0, oooO0O02, oooO0O03, oooO0O04, oooO0O05, oooO0O06, oooO0O07, new OooO0O0(o0000o05, "200"), new OooO0O0(o0000o05, "204"), new OooO0O0(o0000o05, "206"), new OooO0O0(o0000o05, "304"), new OooO0O0(o0000o05, "400"), new OooO0O0(o0000o05, "404"), new OooO0O0(o0000o05, "500"), new OooO0O0("accept-charset", ""), new OooO0O0("accept-encoding", "gzip, deflate"), new OooO0O0("accept-language", ""), new OooO0O0("accept-ranges", ""), new OooO0O0("accept", ""), new OooO0O0("access-control-allow-origin", ""), new OooO0O0(IronSourceSegment.AGE, ""), new OooO0O0("allow", ""), new OooO0O0("authorization", ""), new OooO0O0("cache-control", ""), new OooO0O0("content-disposition", ""), new OooO0O0("content-encoding", ""), new OooO0O0("content-language", ""), new OooO0O0("content-length", ""), new OooO0O0("content-location", ""), new OooO0O0("content-range", ""), new OooO0O0("content-type", ""), new OooO0O0("cookie", ""), new OooO0O0("date", ""), new OooO0O0("etag", ""), new OooO0O0("expect", ""), new OooO0O0("expires", ""), new OooO0O0("from", ""), new OooO0O0("host", ""), new OooO0O0("if-match", ""), new OooO0O0("if-modified-since", ""), new OooO0O0("if-none-match", ""), new OooO0O0("if-range", ""), new OooO0O0("if-unmodified-since", ""), new OooO0O0("last-modified", ""), new OooO0O0("link", ""), new OooO0O0("location", ""), new OooO0O0("max-forwards", ""), new OooO0O0("proxy-authenticate", ""), new OooO0O0("proxy-authorization", ""), new OooO0O0("range", ""), new OooO0O0("referer", ""), new OooO0O0("refresh", ""), new OooO0O0("retry-after", ""), new OooO0O0(C3262jn.f9130a, ""), new OooO0O0("set-cookie", ""), new OooO0O0("strict-transport-security", ""), new OooO0O0("transfer-encoding", ""), new OooO0O0("user-agent", ""), new OooO0O0("vary", ""), new OooO0O0("via", ""), new OooO0O0("www-authenticate", "")};
        f32394OooO00o = oooO0O0Arr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(oooO0O0Arr.length);
        for (int i = 0; i < oooO0O0Arr.length; i++) {
            if (!linkedHashMap.containsKey(oooO0O0Arr[i].f32402OooO00o)) {
                linkedHashMap.put(oooO0O0Arr[i].f32402OooO00o, Integer.valueOf(i));
            }
        }
        f32395OooO0O0 = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void OooO00o(o0000O0 o0000o02) throws IOException {
        int iOooO0o0 = o0000o02.OooO0o0();
        for (int i = 0; i < iOooO0o0; i++) {
            byte bOooOO0 = o0000o02.OooOO0(i);
            if (bOooOO0 >= 65 && bOooOO0 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(o0000o02.OooOOoo()));
            }
        }
    }
}
