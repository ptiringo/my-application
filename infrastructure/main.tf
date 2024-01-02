terraform {
  cloud {
    organization = "ptiringo"

    workspaces {
      name = "ptiringo-application"
    }
  }
}

provider "google" {
  project = "ptiringo-application"
  region  = "asia-northeast1"
}
