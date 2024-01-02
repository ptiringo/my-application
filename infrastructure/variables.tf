variable "tfc_gcp_dynamic_credentials" {
  description = "Object containing GCP dynamic credentials configuration"
  type = object({
    default = object({
      credentials = string
    })
    aliases = map(object({
      credentials = string
    }))
  })
}
