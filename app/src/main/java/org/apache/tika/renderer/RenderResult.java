package org.apache.tika.renderer;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import org.apache.tika.fork.OooO00o;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.p015io.TemporaryResources;
import org.apache.tika.p015io.TikaInputStream;

/* loaded from: classes3.dex */
public class RenderResult implements Closeable, AutoCloseable {

    /* renamed from: id */
    private final int f13237id;
    private final Metadata metadata;
    private final Object result;
    private final STATUS status;
    TemporaryResources tmp = new TemporaryResources();

    /* renamed from: org.apache.tika.renderer.RenderResult$1 */
    public class C45421 implements Closeable, AutoCloseable {
        final /* synthetic */ Object val$result;

        public C45421(Object obj) {
            this.val$result = obj;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Files.delete(OooO00o.OooO0oO(this.val$result));
        }
    }

    public enum STATUS {
        SUCCESS,
        EXCEPTION,
        TIMEOUT
    }

    public RenderResult(STATUS status, int i, Object obj, Metadata metadata) {
        this.status = status;
        this.f13237id = i;
        this.result = obj;
        this.metadata = metadata;
        if (org.apache.tika.pipes.pipesiterator.p017fs.OooO00o.OooOO0O(obj)) {
            this.tmp.addResource(new C45421(obj));
        } else if (obj instanceof Closeable) {
            this.tmp.addResource((Closeable) obj);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.tmp.close();
    }

    public int getId() {
        return this.f13237id;
    }

    public InputStream getInputStream() throws IOException {
        if (org.apache.tika.pipes.pipesiterator.p017fs.OooO00o.OooOO0O(this.result)) {
            return TikaInputStream.get(OooO00o.OooO0oO(this.result), this.metadata);
        }
        TikaInputStream tikaInputStream = TikaInputStream.get(new byte[0]);
        tikaInputStream.setOpenContainer(this.result);
        return tikaInputStream;
    }

    public Metadata getMetadata() {
        return this.metadata;
    }

    public STATUS getStatus() {
        return this.status;
    }
}
