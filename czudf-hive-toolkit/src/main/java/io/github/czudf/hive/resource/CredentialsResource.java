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

public interface CredentialsResource extends Resource {
  /**
   * Serializes this credentials resource to a byte array.
   *
   * <p>The returned byte array typically represents the serialized form of the credentials, such as
   * a protocol buffer, JSON, or other implementation-defined format. The encoding and structure of
   * the byte array depend on the specific implementation.
   *
   * @return a byte array representing the serialized credentials resource
   * @throws RuntimeException if serialization fails (implementation-dependent)
   */
  byte[] toByteArray();

  @Override
  default ResourceType getType() {
    return ResourceType.CREDENTIALS;
  }

  @Deprecated
  default ResourceType getResourceType() {
    return ResourceType.CREDENTIALS;
  }
}
