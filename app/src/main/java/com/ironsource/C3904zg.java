package com.ironsource;

import android.net.Uri;
import android.util.Pair;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.metadata.HttpHeaders;

/* renamed from: com.ironsource.zg */
/* loaded from: classes2.dex */
public class C3904zg {

    /* renamed from: a */
    private static final String f12969a = "POST";

    /* renamed from: b */
    private static final String f12970b = "GET";

    /* renamed from: c */
    private static final String f12971c = "ISHttpService";

    /* renamed from: com.ironsource.zg$a */
    public static class a {

        /* renamed from: h */
        private static final int f12972h = 15000;

        /* renamed from: i */
        private static final int f12973i = 15000;

        /* renamed from: j */
        private static final String f12974j = "UTF-8";

        /* renamed from: a */
        final String f12975a;

        /* renamed from: b */
        final String f12976b;

        /* renamed from: c */
        final String f12977c;

        /* renamed from: d */
        final int f12978d;

        /* renamed from: e */
        final int f12979e;

        /* renamed from: f */
        final String f12980f;

        /* renamed from: g */
        ArrayList<Pair<String, String>> f12981g;

        /* renamed from: com.ironsource.zg$a$a, reason: collision with other inner class name */
        public static class C4590a {

            /* renamed from: b */
            String f12983b;

            /* renamed from: d */
            String f12985d;

            /* renamed from: a */
            List<Pair<String, String>> f12982a = new ArrayList();

            /* renamed from: c */
            String f12984c = "POST";

            /* renamed from: e */
            int f12986e = 15000;

            /* renamed from: f */
            int f12987f = 15000;

            /* renamed from: g */
            String f12988g = a.f12974j;

            /* renamed from: a */
            public C4590a m13340a(int i) {
                this.f12986e = i;
                return this;
            }

            /* renamed from: b */
            public C4590a m13345b(int i) {
                this.f12987f = i;
                return this;
            }

            /* renamed from: c */
            public C4590a m13347c(String str) {
                this.f12983b = str;
                return this;
            }

            /* renamed from: d */
            public C4590a m13348d(String str) {
                this.f12984c = str;
                return this;
            }

            /* renamed from: a */
            public C4590a m13341a(Pair<String, String> pair) {
                this.f12982a.add(pair);
                return this;
            }

            /* renamed from: b */
            public C4590a m13346b(String str) {
                this.f12988g = str;
                return this;
            }

            /* renamed from: a */
            public C4590a m13342a(String str) {
                this.f12985d = str;
                return this;
            }

            /* renamed from: a */
            public C4590a m13343a(List<Pair<String, String>> list) {
                this.f12982a.addAll(list);
                return this;
            }

            /* renamed from: a */
            public a m13344a() {
                return new a(this);
            }
        }

        public a(C4590a c4590a) {
            this.f12975a = c4590a.f12983b;
            this.f12976b = c4590a.f12984c;
            this.f12977c = c4590a.f12985d;
            this.f12981g = new ArrayList<>(c4590a.f12982a);
            this.f12978d = c4590a.f12986e;
            this.f12979e = c4590a.f12987f;
            this.f12980f = c4590a.f12988g;
        }

        /* renamed from: a */
        public boolean m13339a() {
            return "POST".equals(this.f12976b);
        }
    }

    /* renamed from: a */
    public static C3232ir m13331a(String str, String str2, List<Pair<String, String>> list) throws Exception {
        Uri uriBuild = Uri.parse(str).buildUpon().encodedQuery(str2).build();
        a.C4590a c4590a = new a.C4590a();
        c4590a.m13347c(uriBuild.toString()).m13342a(str2).m13348d("GET").m13343a(list);
        return m13337b(c4590a.m13344a());
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0067: MOVE (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:32:0x0067 */
    /* renamed from: b */
    public static com.ironsource.C3232ir m13337b(com.ironsource.C3904zg.a r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3904zg.m13337b(com.ironsource.zg$a):com.ironsource.ir");
    }

    /* renamed from: a */
    private static HttpURLConnection m13332a(a aVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(aVar.f12975a).openConnection();
        httpURLConnection.setConnectTimeout(aVar.f12978d);
        httpURLConnection.setReadTimeout(aVar.f12979e);
        httpURLConnection.setRequestMethod(aVar.f12976b);
        return httpURLConnection;
    }

    /* renamed from: b */
    public static C3232ir m13338b(String str, String str2, List<Pair<String, String>> list) throws Exception {
        a.C4590a c4590a = new a.C4590a();
        c4590a.m13347c(str).m13342a(str2).m13348d("POST").m13343a(list);
        return m13337b(c4590a.m13344a());
    }

    /* renamed from: a */
    private static void m13333a(HttpURLConnection httpURLConnection, a aVar) throws Exception {
        if (aVar.m13339a()) {
            byte[] bytes = aVar.f12977c.getBytes(aVar.f12980f);
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, Integer.toString(bytes.length));
            m13335a(httpURLConnection, bytes);
        }
    }

    /* renamed from: a */
    private static void m13334a(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) throws ProtocolException {
        for (Pair<String, String> pair : list) {
            httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }

    /* renamed from: a */
    private static void m13335a(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    /* renamed from: a */
    private static boolean m13336a(String str, String str2) {
        return (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) ? false : true;
    }
}
