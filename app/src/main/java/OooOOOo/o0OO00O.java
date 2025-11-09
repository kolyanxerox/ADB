package OooOOOo;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class o0OO00O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final long f13412OooO00o;

    public o0OO00O(long j) {
        this.f13412OooO00o = j;
    }

    public static o0OO00O OooO00o(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new o0OO00O(Long.parseLong(jsonReader.nextString())) : new o0OO00O(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0OO00O) {
            if (this.f13412OooO00o == ((o0OO00O) obj).f13412OooO00o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f13412OooO00o;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return OooO0oO.OooOo.OooOOOO(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f13412OooO00o, "}");
    }
}
