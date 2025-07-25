/*
 * Copyright © 2025 Yunqi Inc (support@yunqi.tech)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.czudf.hive.resource;

import java.io.IOException;
import java.io.InputStream;
import java.time.Instant;

public interface FileResource extends Resource {
  long getFileSize() throws IOException;

  InputStream open() throws IOException;

  /** Returns the last modified time of the local copy of the file resource. */
  Instant getLastModifiedTime() throws IOException;

  @Override
  default ResourceType getType() {
    return ResourceType.FILE;
  }
}
