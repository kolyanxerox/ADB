package org.apache.tika.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class StreamGobbler implements Runnable {

    /* renamed from: is */
    private final InputStream f13243is;
    private final int maxBufferLength;
    List<String> lines = new ArrayList();
    long streamLength = 0;
    boolean isTruncated = false;

    public StreamGobbler(InputStream inputStream, int i) {
        this.f13243is = inputStream;
        this.maxBufferLength = i;
    }

    public boolean getIsTruncated() {
        return this.isTruncated;
    }

    public List<String> getLines() {
        return this.lines;
    }

    public long getStreamLength() {
        return this.streamLength;
    }

    @Override // java.lang.Runnable
    public void run() throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f13243is, StandardCharsets.UTF_8));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    if (this.maxBufferLength >= 0) {
                        long length = this.streamLength + line.length();
                        int i = this.maxBufferLength;
                        if (length > i) {
                            int i2 = i - ((int) this.streamLength);
                            if (i2 > 0) {
                                this.isTruncated = true;
                                this.lines.add(line.substring(0, Math.min(line.length(), i2)));
                            }
                        } else {
                            this.lines.add(line);
                        }
                    }
                    this.streamLength += line.length();
                }
                bufferedReader.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }
}
