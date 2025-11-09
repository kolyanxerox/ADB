package com.applovin.shadow.okhttp3.internal.cache;

import com.applovin.shadow.okhttp3.internal.cache.DiskLruCache;
import java.io.IOException;
import kotlin.jvm.internal.Oooo000;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class DiskLruCache$Editor$newSink$1$1 extends Oooo000 implements o00O0Oo.Oooo000 {
    final /* synthetic */ DiskLruCache this$0;
    final /* synthetic */ DiskLruCache.Editor this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Editor$newSink$1$1(DiskLruCache diskLruCache, DiskLruCache.Editor editor) {
        super(1);
        this.this$0 = diskLruCache;
        this.this$1 = editor;
    }

    @Override // o00O0Oo.Oooo000
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IOException) obj);
        return OooOo.f33195OooO00o;
    }

    public final void invoke(IOException it) {
        kotlin.jvm.internal.OooOo.OooO0o0(it, "it");
        DiskLruCache diskLruCache = this.this$0;
        DiskLruCache.Editor editor = this.this$1;
        synchronized (diskLruCache) {
            editor.detach$okhttp();
        }
    }
}
